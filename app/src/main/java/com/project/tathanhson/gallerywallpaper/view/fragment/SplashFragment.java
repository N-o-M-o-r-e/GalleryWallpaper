package com.project.tathanhson.gallerywallpaper.view.fragment;

import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.navigation.fragment.NavHostFragment;

import com.project.tathanhson.gallerywallpaper.R;
import com.project.tathanhson.gallerywallpaper.databinding.FragmentSplashBinding;
import com.project.tathanhson.gallerywallpaper.view.base.BaseFragment;
import com.project.tathanhson.gallerywallpaper.viewmodel.SplashViewModel;


public class SplashFragment extends BaseFragment<FragmentSplashBinding, SplashViewModel> {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_splash;
    }

    @Nullable
    @Override
    public Class<SplashViewModel> initViewModelClass() {
        return SplashViewModel.class;
    }

    @Nullable
    @Override
    public FragmentSplashBinding initViewBinding() {
        return FragmentSplashBinding.inflate(getLayoutInflater());
    }

    @Override
    public void initView() {
        new Handler().postDelayed(this::goToHomeScreen, 2000);
    }

    private void goToHomeScreen() {
        NavHostFragment.findNavController(this).navigate(R.id.goToHome);
    }


}