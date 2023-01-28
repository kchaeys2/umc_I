package com.umc.i.src.market.feed;

import com.umc.i.src.market.feed.model.GetMarketFeedRes;
import com.umc.i.src.market.feed.model.MarketFeed;
import com.umc.i.src.market.feed.model.PostMarketFeedReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MarketFeedService {

    private final MarketFeedDao marketFeedDao;

    public int postNewFeed(PostMarketFeedReq feed, List<MultipartFile> multipartFiles) {
        return marketFeedDao.postNewFeed(feed, multipartFiles);
    }

    public void updateFeed(String marketIdx, PostMarketFeedReq feed) {
        marketFeedDao.updateFeed(marketIdx, feed);
    }

    public List<GetMarketFeedRes> getFeedByCategory(String category, int userIdx, String soldout, int page) {
        return marketFeedDao.getFeedByCategory(category, userIdx, soldout, page);
    }

    public List<MarketFeed> getFeedByMarketIdx(String marketIdx) {
        return marketFeedDao.getFeedByMarketIdx(marketIdx);
    }

    public void updateMarketFeedHitCount(String marketIdx) {
        marketFeedDao.updateFeedHitCount(marketIdx);
    }

    public void deleteFeed(String marketIdx) {
        marketFeedDao.deleteFeed(marketIdx);
    }

    public void feedLike(int userIdx, int marketIdx) {
        marketFeedDao.feedLike(userIdx, marketIdx);
    }

    public List<GetMarketFeedRes> getFeedByUserIdx(int userIdx) {
        List<GetMarketFeedRes> result = marketFeedDao.getFeedByUserIdx(userIdx);
        return result;
    }

    public int getFeedUserIdx(String marketIdx) {
        int feedUserIdx = marketFeedDao.getFeedUserIdx(marketIdx);
        return feedUserIdx;
    }
}
