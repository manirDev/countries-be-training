package com.manirdev.countriesbe.util.constants;

import com.manirdev.countriesbe.entity.Country;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Api {
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Country{
        public static final String BASE_URL = "/country";
    }
}
