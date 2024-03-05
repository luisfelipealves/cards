package com.eazybank.cards.mapper;

import com.eazybank.cards.dto.CardsDto;
import com.eazybank.cards.entity.Cards;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardsMapper {
    CardsDto toDto(Cards cards);
    Cards toEntity(CardsDto cardsDto);
}
