package com.company.my_project.screen.products;

import io.jmix.ui.screen.*;
import com.company.my_project.entity.Products;

@UiController("Products.browse")
@UiDescriptor("products-browse.xml")
@LookupComponent("productsesTable")
public class ProductsBrowse extends StandardLookup<Products> {
}