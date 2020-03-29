package com.gu.demoswagger.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/h")
public class OdinAPIs {

    List<Books> booksList = new ArrayList<Books>();

    @GetMapping(value = "")
    public String reply(){
        return "demo swagger start";

    }
    @ApiOperation(value="get id number", notes="获取id号")
    @ApiImplicitParam(name = "id", value = "id number", required = true, paramType = "path")
    @GetMapping(value = "/{id}")
    public String getIndex(@PathVariable("id") int id){
        System.out.println(id);
        return booksList.get(id).getValue();
    }


    @ApiOperation(value="put books", notes="增加book")
    @ApiImplicitParam(name = "insert book", value = "", required = true, dataType = "Books")
    @PostMapping(value = "")
    public String setIndex(@RequestBody Books books){
        System.out.println(books.getId());
        System.out.println(books.getValue());
        booksList.add(books);
        return "ok";
    }
}
