package com.geekText.geekText.Controller;

import com.geekText.geekText.Entity.Wishlist;
import com.geekText.geekText.Service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    // addWishList creates a new wish list
    @PostMapping("/addWishlist")
    public Wishlist postDetails(@RequestBody Wishlist wishlist) {

        return wishlistService.saveDetails(wishlist);

    }

    // getWishList returns a list of objects in the wish list table
    @GetMapping("/getWishlist")
    public List<Wishlist> getWishlist() {
        return wishlistService.getWishlist();
    }

}
