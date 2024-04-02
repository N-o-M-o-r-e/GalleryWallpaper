package com.project.tathanhson.gallerywallpaper.view.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.tathanhson.gallerywallpaper.R;
import com.project.tathanhson.gallerywallpaper.databinding.FragmentHomeBinding;
import com.project.tathanhson.gallerywallpaper.view.base.BaseFragment;
import com.project.tathanhson.gallerywallpaper.viewmodel.HomeViewModel;


public class HomeFragment extends BaseFragment<FragmentHomeBinding, HomeViewModel> {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initView() {

    }

    @Override
    public Class<HomeViewModel> initViewModelClass() {
        return HomeViewModel.class;
    }

    @Override
    public FragmentHomeBinding initViewBinding() {
        return FragmentHomeBinding.inflate(getLayoutInflater());
    }
}