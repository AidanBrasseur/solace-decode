package com.example.solace.decode.Services;

import com.example.solace.decode.model.Channel;
import com.example.solace.decode.model.ChannelCategory;
import com.example.solace.decode.repository.ChannelCategoriesRepository;
import com.example.solace.decode.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ChannelService {

    private ChannelRepository channelRepository;
    private ChannelCategoriesRepository channelCategoriesRepository;

    @Autowired
    public ChannelService(ChannelRepository channelRepository, ChannelCategoriesRepository channelCategoriesRepository) {
        this.channelRepository = channelRepository;
        this.channelCategoriesRepository = channelCategoriesRepository;
    }

    public List<Channel> getChannels() {
        return this.channelRepository.findAll();
    }

    public List<ChannelCategory> getChannelCategories(Integer id) {
        return this.channelCategoriesRepository.findCategoriesByChannel(id);
    }

    @Transactional
    public void createChannel(Channel channel) {
        channelRepository.save(channel);
    }
}


