package com.jacksen.taggroup;

import android.graphics.drawable.Drawable;

/**
 * Created by jacksen on 2017/7/10.
 */

public class ITagBean implements ITag {

    private CharSequence tag;

    private int horizontalPadding;

    private int verticalPadding;

    private float cornerRadius;

    private float borderWidth;

    private int borderColor;

    private int bgColor;

    private Drawable backgroundDrawable;

    private int backgroundResourceId;

    private boolean isAppendTag;

    private ITagBean(Builder builder) {
        this.tag = builder.tag;
        this.horizontalPadding = builder.horizontalPadding;
        this.verticalPadding = builder.verticalPadding;
        this.cornerRadius = builder.cornerRadius;
        this.borderWidth = builder.borderWidth;
        this.borderColor = builder.borderColor;
        this.bgColor = builder.bgColor;
        this.backgroundDrawable = builder.backgroundDrawable;
        this.backgroundResourceId = builder.backgroundResourceId;
        this.isAppendTag = builder.isAppendTag;
    }

    @Override
    public CharSequence getText() {
        return tag;
    }

    @Override
    public int getId() {
        return SuperTagUtil.generateViewId();
    }

    public int getHorizontalPadding() {
        return horizontalPadding;
    }

    public int getVerticalPadding() {
        return verticalPadding;
    }

    public float getCornerRadius() {
        return cornerRadius;
    }

    @Override
    public Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    @Override
    public int getBackgroundResourceId() {
        return this.backgroundResourceId;
    }

    @Override
    public boolean isAppendTag() {
        return this.isAppendTag;
    }

    public float getBorderWidth() {
        return borderWidth;
    }

    public int getBorderColor() {
        return borderColor;
    }

    public int getBgColor() {
        return bgColor;
    }

    public static class Builder {
        private CharSequence tag;

        private int horizontalPadding;

        private int verticalPadding;

        private float cornerRadius;

        private float borderWidth;

        private int borderColor;

        private int bgColor;

        private Drawable backgroundDrawable;

        private int backgroundResourceId;

        private boolean isAppendTag;

        public Builder setTag(CharSequence tag) {
            this.tag = tag;
            return this;
        }

        public Builder setHorizontalPadding(int horizontalPadding) {
            this.horizontalPadding = horizontalPadding;
            return this;
        }

        public Builder setVerticalPadding(int verticalPadding) {
            this.verticalPadding = verticalPadding;
            return this;
        }

        public Builder setCornerRadius(float cornerRadius) {
            this.cornerRadius = cornerRadius;
            return this;
        }

        public Builder setBorderWidth(float borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }

        public Builder setBorderColor(int borderColor) {
            this.borderColor = borderColor;
            return this;
        }

        public Builder setBgColor(int bgColor) {
            this.bgColor = bgColor;
            return this;
        }

        public Builder setBackgroundDrawable(Drawable backgroundDrawable) {
            this.backgroundDrawable = backgroundDrawable;
            return this;
        }

        public Builder setBackgroundResourceId(int backgroundResourceId) {
            this.backgroundResourceId = backgroundResourceId;
            return this;
        }

        public Builder setAppendTag(boolean appendTag) {
            isAppendTag = appendTag;
            return this;
        }

        public ITagBean create() {
            return new ITagBean(this);
        }
    }

}
