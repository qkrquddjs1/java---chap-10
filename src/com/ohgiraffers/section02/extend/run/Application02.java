package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.Bunny;
import com.ohgiraffers.section02.extend.DrunkenBunny;
import com.ohgiraffers.section02.extend.Rabbit;
import com.ohgiraffers.section02.extend.RabbitFarm;
import com.ohgiraffers.section02.extend.WildCardFarm;

public class Application02 {
    public static void main(String[] args) {
        /* 와일드 카드에 대해 이해할 수 있다. */
        /* 제네릭 클래스 타읍의 객체를 메소드의 매개변수로 받을때,
        * 그 객체의 타입 변수를 제한할 수 있다. */

        WildCardFarm wildCarFarm = new WildCardFarm();

        /* 1. 매개변수의 타입 제한이 없는 경우 => 어떤토끼를 가진 토끼 농장이던 인자로 전달 가능하다.  */
        wildCarFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wildCarFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCarFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));

        /* 2. 매개변수의 타입이 바니이거나 바니 후손 토끼를 가진 토끼농장만 인자로 전달 가능 */
//        wildCarFarm.extendsType(new RabbitFarm<>(new Rabbit()));
        wildCarFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildCarFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));

        /* 3. 매개변수의 타입이 바니이거나 바니 상위 타입의 토끼를 가진 토끼농장만 인자로 전달가능 */
        wildCarFarm.superType(new RabbitFarm<>(new Rabbit()));
        wildCarFarm.superType(new RabbitFarm<>(new Bunny()));
//        wildCarFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));




    }
}
