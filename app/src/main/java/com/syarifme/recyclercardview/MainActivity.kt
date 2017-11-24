package com.syarifme.recyclercardview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var products : ArrayList<Product> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvProduct.layoutManager = GridLayoutManager(this, 2)

        var price = 12000
        for (i in 1..10) {
            price += i * 10
            val product = Product("Nama Produk $i", price)
            products.add(product)
        }

        rvProduct.adapter = ProductAdapter(products)
    }
}
