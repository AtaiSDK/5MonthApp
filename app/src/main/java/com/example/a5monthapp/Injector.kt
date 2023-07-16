package com.example.a5monthapp

class Injector {

    companion object{
        fun getModel() = Model()
        fun getPresenter(view: CounterView) = Presenter(view)
    }
}