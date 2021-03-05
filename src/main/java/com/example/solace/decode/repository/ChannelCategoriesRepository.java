package com.example.solace.decode.repository;

import com.example.solace.decode.model.ChannelCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChannelCategoriesRepository extends JpaRepository<ChannelCategory, Integer> {
    List<ChannelCategory> findCategoriesByChannel(Integer channelId);
}
