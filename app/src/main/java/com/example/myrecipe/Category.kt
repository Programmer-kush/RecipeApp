package com.example.myrecipe

data class Category(
    val idCategory:String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription:String
    )

data class CategoryResponse(val categories:List<Category>)

//idCategory": "1",
//"strCategory": "Beef",
//"strCategoryThumb": "https://www.themealdb.com/images/category/beef.png",
//"strCategoryDescription":
//kush new