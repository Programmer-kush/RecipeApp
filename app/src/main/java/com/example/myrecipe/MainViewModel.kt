package com.example.myrecipe

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class MainViewModel:ViewModel() {

    val categoriesState: State<RecipeState> = _categoryState

    init {
        fetchCategories()//call when viewmodel is initialized
    }

    private fun fetchCategories(){
        viewModelScope.launch{
                try {
                        val response= recipeService.getCategories()
                        _categoryState.value= _categoryState.value.copy(
                            list = response.categories,
                            loading = false,
                            error = null

                        )

                }
                catch (e: Exception){
                    _categoryState.value= _categoryState.value.copy(
                        loading = false,
                        error = "Erron in fetching Categories ${e.message}"
                    )
                }
        }

    }


}
private val _categoryState= mutableStateOf(RecipeState())
val categoriesState:State<RecipeState> =_categoryState


data class RecipeState(
    val loading:Boolean=true,
    val list:List<Category> = emptyList(),
    val error:String?=null//means nullable string

)




