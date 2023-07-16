package com.example.a5monthapp

class Presenter constructor(var view : CounterView) {

    var model = Injector.getModel()

    fun increment(){
        model.increment()
        view.showCount(model.count)
        if(model.count == 10){
            view.showToast("Поздравляем!")
        }
        if(model.count == 15){
            view.changeColor()
        }
    }

    fun decrement(){
        model.decrement()
        view.showCount(model.count)
    }

    fun darkTheme(){
        if(!model.isDark){
            model.isDark = true
            view.darkTheme()
        }else{
            model.isDark = false
            view.lightTheme()
        }
    }
}