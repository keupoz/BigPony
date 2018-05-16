package com.minelittlepony.bigpony.mod;

public enum CameraPresets {
    HUMAN(1F, 1F),
    MARE(.75F, 1F),
    STALLION(.9F, 1.1F),
    ALICORN(1.15F, 1.2F),
    FILLY(.5F, .7F),
    GIANT(2F, 1.1F),
    ANT(0.1F, 0.1F);

    private float height;
    private float distance;

    CameraPresets(float height, float distance) {
        this.height = height;
        this.distance = distance;
    }

    public float getHeight() {
        return height;
    }

    public float getDistance() {
        return distance;
    }

    public boolean isEqual(float height, float distance) {
        return FloatUtils.equals(this.height, height)
                && FloatUtils.equals(this.distance, distance);
    }

    public boolean isEqual(float scaleX, float scaleY, float scaleZ) {
        return this.height == scaleX
                && this.height == scaleY
                && this.height == scaleZ;
    }
}
