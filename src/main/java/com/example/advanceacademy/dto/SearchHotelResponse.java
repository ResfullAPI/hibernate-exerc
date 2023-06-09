package com.example.advanceacademy.dto;

import com.example.advanceacademy.entity.Address;
import lombok.*;

@Getter
@Setter
@Builder
public class SearchHotelResponse extends HotelResponse{
    private Address address;

    public SearchHotelResponse(Address address) {
        this.address = address;
    }

    public SearchHotelResponse(String hotelName, Long id,String phoneNumber, Address address) {
        super(hotelName,id,phoneNumber,address);
    }

    public SearchHotelResponse() {

    }
}
