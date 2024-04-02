package com.project.tathanhson.gallerywallpaper.view.interfaces;

import androidx.viewbinding.ViewBinding;

import com.project.tathanhson.gallerywallpaper.view.base.BaseViewModel;

public interface IView<V extends ViewBinding, VM extends BaseViewModel> {
    void initView();
    Class<VM> initViewModelClass();
    V initViewBinding();
}
