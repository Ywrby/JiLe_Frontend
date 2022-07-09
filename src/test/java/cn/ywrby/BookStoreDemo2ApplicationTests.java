package cn.ywrby;


import cn.ywrby.mapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookStoreDemo2ApplicationTests {


    @Autowired
    UserMapper userMapper;

    @Test
    public void testShowDataH2(){
        userMapper.showData();
    }

    @Test
    public void testInsertH2(){
        userMapper.insertData("123455","张三",9999);
    }

}
