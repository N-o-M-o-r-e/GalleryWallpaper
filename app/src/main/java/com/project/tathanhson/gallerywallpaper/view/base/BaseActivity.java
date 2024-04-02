package com.project.tathanhson.gallerywallpaper.view.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

import com.project.tathanhson.gallerywallpaper.view.interfaces.IView;

public abstract class BaseActivity<V extends ViewBinding, VM extends BaseViewModel>
        extends FragmentActivity implements IView<V, VM> {
    protected V binding;
    protected VM viewModel;
    @Override
    protected final void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = initViewBinding();
        viewModel = new ViewModelProvider(this).get(initViewModelClass());
        setContentView(binding.getRoot());
        initView();
    }
}
