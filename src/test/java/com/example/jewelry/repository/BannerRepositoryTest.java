package com.example.jewelry.repository;

import com.example.jewelry.entity.Banner;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@RunWith(SpringRunner.class)
class BannerRepositoryTest {

    @Autowired
    BannerRepository bannerRepository;

    @Test
    public void testGet() {
        List<Banner> bannerList = bannerRepository.findAll();
        System.out.println(bannerList);
    }

    @Test
    public void testInsert(){
        Banner banner = new Banner();
        banner.setImg("test");
        banner.setWeight(1);

        bannerRepository.save(banner);
    }

    @Test
    public void testUpdate () {

        Optional<Banner> bannerOpt = bannerRepository.findById(1L);
        if (bannerOpt.isPresent()) {
            Banner banner = bannerOpt.get();
            System.out.println(banner);
            banner.setImg(banner + "1");
            bannerRepository.save(banner);
        }
    }

    @Test
    public void testDelete () {
        Banner banner = new Banner();
        banner.setId(1L);
        bannerRepository.delete(banner);
    }
}