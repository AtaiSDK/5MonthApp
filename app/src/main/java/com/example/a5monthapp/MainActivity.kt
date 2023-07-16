package com.example.a5monthapp

import android.annotation.SuppressLint
import android.graphics.Color.green
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.a5monthapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    private var presenter = Injector.getPresenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding){
            incrementBtn.setOnClickListener{
                presenter.increment()
            }
            decrementBtn.setOnClickListener{
                presenter.decrement()
            }
            darkThemeBtn.setOnClickListener {
                presenter.darkTheme()
            }
        }
    }

    override fun showCount(count: Int) {
        binding.counterTv.text = count.toString()
    }

    override fun showToast(congratulations: String) {
        Toast.makeText(this, congratulations, Toast.LENGTH_SHORT).show()
    }

    @SuppressLint("ResourceAsColor")
    override fun darkTheme() {
        binding.root.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
        binding.counterTv.setTextColor(ContextCompat.getColor(this, R.color.white))
    }

    @SuppressLint("ResourceAsColor")
    override fun lightTheme() {
        binding.root.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        binding.counterTv.setTextColor(ContextCompat.getColor(this, R.color.black))
    }

    override fun changeColor() {
        binding.counterTv.setTextColor(ContextCompat.getColor(this, R.color.green))
    }
}