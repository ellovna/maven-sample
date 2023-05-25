package com.solvd.laba.lambda;

import com.solvd.laba.lambda.interfaces.ICarChecks;

class CheckPrice implements ICarChecks {
    // anonymous class
    // no need to create this class, especially if used once
    @Override
    public boolean check(Car c){
        return c.averagePrice>30000;
    }

}
