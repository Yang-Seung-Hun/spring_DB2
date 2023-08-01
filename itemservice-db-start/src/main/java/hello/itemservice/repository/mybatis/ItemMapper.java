package hello.itemservice.repository.mybatis;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

/**
 * 마이바티스 매핑 XML 을 호출해주는 매퍼 인터페이스
 * 이 인터페이스에는 @Mapper 애노테이션을 붙여주어야 MyBatis 에서 인식할 수 있음
 * 이 인터페이스의 메서드를 호출하면 다음에 보이는 xml 의 해당 SQL 을 실행하고 결과를 돌려줌
 * ItemMapper 인터페이스의 구현체에 대한 부분은 추후 설명
 */
@Mapper
public interface ItemMapper {

    void save(Item item);

    void update(@Param("id") Long id, @Param("updateParam") ItemUpdateDto updateParam);

    Optional<Item> findById(Long id);

    List<Item> findAll(ItemSearchCond itemSearch);
}
