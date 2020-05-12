package vip.ruoyun.skin.butler.core;

import android.content.res.Resources;

public class SkinCache {

    public final Resources skinResources; // 用于加载皮肤包资源

    public final String skinPackageName; // 皮肤包资源所在包名（注：皮肤包不在app内，也不限包名）

    public SkinCache(Resources skinResources, String skinPackageName) {
        this.skinResources = skinResources;
        this.skinPackageName = skinPackageName;
    }
}
