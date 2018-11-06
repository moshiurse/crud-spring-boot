package com.moshiurse.practice.boot.crud.repository;

import com.moshiurse.practice.boot.crud.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Moshiur on 11/7/2018.
 */
public interface AddressRepository extends JpaRepository<Address, Long>{
}
