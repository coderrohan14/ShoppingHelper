package com.rohan.shoppinglistapp.ui.shoppingList

import com.rohan.shoppinglistapp.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item:ShoppingItem)
}