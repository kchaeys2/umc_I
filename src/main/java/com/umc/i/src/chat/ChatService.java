package com.umc.i.src.chat;

import com.umc.i.src.feeds.FeedsDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChatService {
    @Autowired
    private FeedsDao feedsDao;
}
