import os
import glob
import numpy as np
import torch

from torch import nn
from torch.utils.data import Dataset, DataLoader

# ── paths relative to this script ────────────────────────────
SCRIPT_DIR = os.path.dirname(os.path.abspath(__file__))
LOG_DIR = os.path.join(SCRIPT_DIR, "nexis_rotation_logs")
OUT_DIR = os.path.join(SCRIPT_DIR, "nexis_models")

os.makedirs(OUT_DIR, exist_ok=True)

# ── model key -> subfolder inside LOG_DIR ────────────────────
MODELS = {
    "sharp": "1",
    "smooth": "2",
    "precise": "3",
}

# ── data params ──────────────────────────────────────────────
T = 10
F = 11  # cooldown убран (было 13)

LABEL_DEADZONE = 0.0
BALANCE_ZEROS = True

# seq + f0..f10 + dyaw + dpitch
EXPECTED_COLS = 1 + F + 2

HIDDEN = 96
LAYERS = 1

EPOCHS = 120
BATCH = 64
LR = 1e-3

if torch.cuda.is_available():
    DEVICE = "cuda"
else:
    DEVICE = "cpu"


def load_csv(path):
    try:
        data = np.genfromtxt(path, delimiter=",", skip_header=1, dtype=np.float32)
    except Exception as e:
        print(f"    skip ({os.path.basename(path)}): read error: {e}")
        return None

    if data.ndim != 2:
        print(f"    skip ({os.path.basename(path)}): ndim={data.ndim}")
        return None

    if len(data) <= T:
        print(f"    skip ({os.path.basename(path)}): too few rows")
        return None

    if data.shape[1] != EXPECTED_COLS:
        print(
            f"    skip ({os.path.basename(path)}): cols={data.shape[1]}, expected {EXPECTED_COLS}. "
            f"Probably old CSV (с cooldown)."
        )
        return None

    if not np.isfinite(data).all():
        print(f"    skip ({os.path.basename(path)}): NaN/Inf")
        return None

    return data


def apply_label_deadzone(dy, dp):
    if LABEL_DEADZONE > 0.0:
        if abs(dy) < LABEL_DEADZONE:
            dy = 0.0
        if abs(dp) < LABEL_DEADZONE:
            dp = 0.0

    return dy, dp


def make_windows_for_segment(seg):
    x_move = []
    y_move = []

    x_stop = []
    y_stop = []

    # columns:
    # 0 = seq
    # 1..F = features
    # F + 1 = dyaw
    # F + 2 = dpitch
    feats = seg[:, 1:1 + F]
    labels = seg[:, 1 + F:1 + F + 2]

    if len(seg) <= T:
        return (
            np.empty((0, T, F), np.float32),
            np.empty((0, 2), np.float32),
        )

    for i in range(len(seg) - T):
        dy = float(labels[i + T - 1][0])
        dp = float(labels[i + T - 1][1])

        dy, dp = apply_label_deadzone(dy, dp)

        win = feats[i:i + T]

        if dy == 0.0 and dp == 0.0:
            x_stop.append(win)
            y_stop.append((dy, dp))
        else:
            x_move.append(win)
            y_move.append((dy, dp))

    if BALANCE_ZEROS and x_move and len(x_stop) > len(x_move):
        idx = np.random.choice(len(x_stop), len(x_move), replace=False)
        x_stop = [x_stop[j] for j in idx]
        y_stop = [y_stop[j] for j in idx]

    x = x_move + x_stop
    y = y_move + y_stop

    if not x:
        return (
            np.empty((0, T, F), np.float32),
            np.empty((0, 2), np.float32),
        )

    return np.array(x, np.float32), np.array(y, np.float32)


def make_windows(data):
    xs = []
    ys = []

    seq_col = data[:, 0].astype(np.int32)
    seqs = np.unique(seq_col)

    for seq in seqs:
        seg = data[seq_col == seq]

        if len(seg) <= T:
            continue

        xi, yi = make_windows_for_segment(seg)

        if len(xi) == 0:
            continue

        xs.append(xi)
        ys.append(yi)

    if not xs:
        return (
            np.empty((0, T, F), np.float32),
            np.empty((0, 2), np.float32),
        )

    return np.concatenate(xs), np.concatenate(ys)


def load_folder(folder):
    dir_path = os.path.join(LOG_DIR, folder)

    if not os.path.isdir(dir_path):
        print(f"  missing folder: {dir_path}")
        return None, None, 0

    csv_paths = sorted(glob.glob(os.path.join(dir_path, "*.csv")))

    if not csv_paths:
        print(f"  no .csv in folder '{folder}'")
        return None, None, 0

    xs = []
    ys = []
    used = 0

    for path in csv_paths:
        data = load_csv(path)

        if data is None:
            continue

        xi, yi = make_windows(data)

        if len(xi) == 0:
            print(f"    0 windows: {os.path.basename(path)}")
            continue

        xs.append(xi)
        ys.append(yi)
        used += 1

        print(f"    + {os.path.basename(path)}: {len(xi)} windows")

    if not xs:
        return None, None, 0

    return np.concatenate(xs), np.concatenate(ys), used


def augment_mirror_yaw(x, y):
    """
    Mirror left/right. Индексы фич (cooldown убран, F=11):

    f0  yawErr              flip
    f1  pitchErr            same
    f2  dist                same
    f3  relForward          same
    f4  relRight            flip
    f5  relY                same
    f6  playerForward       same
    f7  playerRight         flip
    f8  prevDYaw            flip
    f9  prevDPitch          same
    f10 targetHurtTime      same

    Labels:
    dyaw                    flip
    dpitch                  same
    """
    xm = x.copy()
    ym = y.copy()

    xm[:, :, 0] *= -1.0
    xm[:, :, 4] *= -1.0
    xm[:, :, 7] *= -1.0
    xm[:, :, 8] *= -1.0

    ym[:, 0] *= -1.0

    return np.concatenate([x, xm]), np.concatenate([y, ym])


class DS(Dataset):
    def __init__(self, x, y):
        self.x = torch.tensor(x, dtype=torch.float32)
        self.y = torch.tensor(y, dtype=torch.float32)

    def __len__(self):
        return len(self.x)

    def __getitem__(self, i):
        return self.x[i], self.y[i]


class GRURot(nn.Module):
    def __init__(self):
        super().__init__()
        self.gru = nn.GRU(F, HIDDEN, LAYERS, batch_first=True)
        self.head = nn.Linear(HIDDEN, 2)

    def forward(self, x):
        o, _ = self.gru(x)
        return self.head(o[:, -1])


def describe_dataset(name, x, y, used):
    zeros = int(np.sum((np.abs(y[:, 0]) + np.abs(y[:, 1])) == 0.0))

    print(
        f"[{name}] files: {used} | samples: {len(x)} | zeros: {zeros} | "
        f"avg|dyaw|: {float(np.abs(y[:, 0]).mean()):.3f} | "
        f"avg|dpitch|: {float(np.abs(y[:, 1]).mean()):.3f} | "
        f"max|dyaw|: {float(np.abs(y[:, 0]).max()):.3f} | "
        f"max|dpitch|: {float(np.abs(y[:, 1]).max()):.3f}"
    )


def train_one(name, folder):
    print(f"[{name}] folder '{folder}':")

    x, y, used = load_folder(folder)

    if x is None or len(x) == 0:
        print(f"[{name}] skip — no valid data in folder '{folder}'")
        return

    describe_dataset(name + " raw", x, y, used)

    x, y = augment_mirror_yaw(x, y)

    describe_dataset(name + " aug", x, y, used)

    loader = DataLoader(
        DS(x, y),
        batch_size=BATCH,
        shuffle=True,
        drop_last=False,
    )

    model = GRURot().to(DEVICE)
    opt = torch.optim.Adam(model.parameters(), lr=LR)
    loss_fn = nn.SmoothL1Loss()

    model.train()

    for ep in range(EPOCHS):
        total = 0.0

        for xb, yb in loader:
            xb = xb.to(DEVICE)
            yb = yb.to(DEVICE)

            opt.zero_grad()

            pred = model(xb)
            loss = loss_fn(pred, yb)

            loss.backward()
            opt.step()

            total += loss.item() * len(xb)

        if (ep + 1) % 20 == 0:
            print(f"  [{name}] ep {ep + 1}/{EPOCHS} loss {total / len(x):.4f}")

    model.eval()

    dummy = torch.randn(1, T, F, dtype=torch.float32).to(DEVICE)
    out_path = os.path.join(OUT_DIR, f"rotation_{name}.onnx")

    torch.onnx.export(
        model,
        dummy,
        out_path,
        input_names=["input"],
        output_names=["output"],
        opset_version=17,
        dynamo=False,
    )

    if os.path.exists(out_path + ".data"):
        os.remove(out_path + ".data")

    print(f"[{name}] export -> {out_path}")


def main():
    print(f"device: {DEVICE}")
    print(f"T={T}, F={F}")
    print(f"LOG_DIR={LOG_DIR}")
    print(f"OUT_DIR={OUT_DIR}")

    for name, folder in MODELS.items():
        train_one(name, folder)

    print("done")


if __name__ == "__main__":
    main()
