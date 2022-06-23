package com.company.my_project.screen.products;

import io.jmix.ui.screen.*;
import com.company.my_project.entity.Products;

@UiController("Products.edit")
@UiDescriptor("products-edit.xml")
@EditedEntityContainer("productsDc")
public class ProductsEdit extends StandardEditor<Products> {
}