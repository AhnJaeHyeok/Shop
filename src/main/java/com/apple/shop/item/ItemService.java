package com.apple.shop.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;      // 함수로 뺄 땐 안에있는 변수들도 따로 정의해줘야함.

    public void saveItem(String title, Integer price) {
        Item item = new Item();     // DB 입출력 기능
        item.setTitle(title);
        item.setPrice(price);
        itemRepository.save(item);
    }

    public void editItem(String title, Integer price, Long id) {
        if (title.length() > 10){ // 제목 길이 체크
            throw new IllegalArgumentException("10자 이내로 입력해주세요");
        }
        if (price < 0){ // 가격 음수 체크
            throw new IllegalArgumentException("음수가 왠말?");
        }


            Item item = new Item();
            item.setId(id);
            item.setTitle(title);
            item.setPrice(price);
            itemRepository.save(item);
    }
}
