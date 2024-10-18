package com.example.groupwork

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main6)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val home4Button: Button = findViewById(R.id.home4)
        home4Button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val sewingCheckbox: CheckBox = findViewById(R.id.sewing_checkbox)
        val firstAidCheckbox: CheckBox = findViewById(R.id.firstaid_checkbox)
        val landscapingCheckbox: CheckBox = findViewById(R.id.landscaping_checkbox)
        val lifeSkillsCheckbox: CheckBox = findViewById(R.id.lifeskills_checkbox)
        val childMindingCheckbox: CheckBox = findViewById(R.id.childminding_checkbox)
        val cookingCheckbox: CheckBox = findViewById(R.id.cooking_checkbox)
        val gardenCheckbox: CheckBox = findViewById(R.id.garden_checkbox)

        val totalTextView: TextView = findViewById(R.id.total)
        val discountTextView: TextView = findViewById(R.id.discount)
        val totaldisTextView: TextView = findViewById(R.id.totaldis)

        val checkboxes = listOf(sewingCheckbox, firstAidCheckbox, landscapingCheckbox, lifeSkillsCheckbox, childMindingCheckbox, cookingCheckbox, gardenCheckbox)

        val enterbButton: Button = findViewById(R.id.enterb)
        enterbButton.setOnClickListener {
            var total = 0.0 // initial total

            for (checkbox in checkboxes) {
                if (checkbox.isChecked) {
                    if (checkbox == sewingCheckbox || checkbox == firstAidCheckbox || checkbox == landscapingCheckbox || checkbox == lifeSkillsCheckbox) {
                        total += 1500
                    } else if (checkbox == childMindingCheckbox || checkbox == cookingCheckbox || checkbox == gardenCheckbox) {
                        total += 750
                    }
                }
            }

            val checkedCount = checkboxes.count { it.isChecked }
            var discount = 0.0
            var discountPercentage = 0
            if (checkedCount == 2) {
                // Apply a 5% discount
                discount = total * 0.05
                discountPercentage = 5
            } else if (checkedCount == 3) {
                // Apply a 10% discount
                discount = total * 0.10
                discountPercentage = 10
            } else if (checkedCount > 3) {
                // Apply a 15% discount
                discount = total * 0.15
                discountPercentage = 15
            }

            val discountedTotal = total - discount
            totalTextView.text = "Total: $total"
            discountTextView.text = "Discount: $discountPercentage%"
            totaldisTextView.text = "Discounted Total: $discountedTotal"
        }
    }
}