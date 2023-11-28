package com.example.gulimall.product;

import com.example.gulimall.product.entity.BrandEntity;
import com.example.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

    @Test
    void editBrand(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为荣耀8手机");
        brandService.updateById(brandEntity);
    }

    @Test
    void delBrand(){
        brandService.removeById(2L);
    }

    @Test
    void schBrand(){
        List<BrandEntity> list = brandService.list();
        list.forEach(item->{
            System.out.println(item);
        });
    }

}
