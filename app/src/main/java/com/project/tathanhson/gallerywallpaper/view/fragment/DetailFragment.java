package com.project.tathanhson.gallerywallpaper.view.fragment;

import com.project.tathanhson.gallerywallpaper.R;
import com.project.tathanhson.gallerywallpaper.databinding.FragmentDetailBinding;
import com.project.tathanhson.gallerywallpaper.view.base.BaseFragment;
import com.project.tathanhson.gallerywallpaper.viewmodel.DetailViewModel;


public class DetailFragment extends BaseFragment<FragmentDetailBinding, DetailViewModel> {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_detail;
    }

    @Override
    public void initView() {

    }

    @Override
    public Class<DetailViewModel> initViewModelClass() {
        return DetailViewModel.class;
    }

    @Override
    public FragmentDetailBinding initViewBinding() {
        return FragmentDetailBinding.inflate(getLayoutInflater());
    }
}