package com.company.my_project.screen.buyers;

import io.jmix.ui.screen.*;
import com.company.my_project.entity.Buyers;

@UiController("Buyers.browse")
@UiDescriptor("buyers-browse.xml")
@LookupComponent("buyersesTable")
public class BuyersBrowse extends StandardLookup<Buyers> {
}