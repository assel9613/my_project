package com.company.my_project.screen.buyers;

import io.jmix.ui.screen.*;
import com.company.my_project.entity.Buyers;

@UiController("Buyers.edit")
@UiDescriptor("buyers-edit.xml")
@EditedEntityContainer("buyersDc")
public class BuyersEdit extends StandardEditor<Buyers> {
}