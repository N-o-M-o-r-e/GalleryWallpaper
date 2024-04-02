package com.project.tathanhson.gallerywallpaper.view.activity;

import androidx.navigation.fragment.NavHostFragment;

import com.project.tathanhson.gallerywallpaper.databinding.ActivityMainBinding;
import com.project.tathanhson.gallerywallpaper.view.base.BaseActivity;
import com.project.tathanhson.gallerywallpaper.viewmodel.MainViewModel;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> {

    @Override
    public void initView() {
        viewModel.parseHTML();
    }

    @Override
    public Class<MainViewModel> initViewModelClass() {
        return MainViewModel.class;
    }

    @Override
    public ActivityMainBinding initViewBinding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }
}