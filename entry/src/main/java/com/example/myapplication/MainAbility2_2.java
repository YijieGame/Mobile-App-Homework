package com.example.myapplication;

import com.example.myapplication.slice.MainAbility2_2Slice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility2_2 extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbility2_2Slice.class.getName());
    }
}
