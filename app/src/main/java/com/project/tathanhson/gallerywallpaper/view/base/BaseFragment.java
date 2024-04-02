package com.project.tathanhson.gallerywallpaper.view.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

import com.project.tathanhson.gallerywallpaper.view.interfaces.IView;

public abstract class BaseFragment<V extends ViewBinding, VM extends BaseViewModel> extends Fragment implements IView<V, VM> {
    protected V binding;
    protected VM viewmodel;

    protected Context context;
    protected Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        inflater.inflate(getLayoutId(), container, false);
        binding = initViewBinding();
        viewmodel = new ViewModelProvider(this).get(initViewModelClass());
        return binding.getRoot();
    }


    protected abstract int getLayoutId();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

}
