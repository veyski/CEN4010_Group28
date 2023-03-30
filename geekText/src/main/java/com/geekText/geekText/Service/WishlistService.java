package com.geekText.geekText.Service;

import com.geekText.geekText.Entity.Wishlist;
import com.geekText.geekText.Repository.WishlistRepo;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class WishlistService {

    private final WishlistRepo wishlistRepo;


    public WishlistService(WishlistRepo wishlistRepo) {
        this.wishlistRepo = wishlistRepo;
    }

    public List<Wishlist> getWishlist() {
        return wishlistRepo.findAll();
    }

    public Wishlist saveDetails(Wishlist wishlist){

        return wishlistRepo.save(wishlist);
    }
}
