package com.github.dynamic.threadpool.config.model;

import com.github.dynamic.threadpool.common.toolkit.Md5Util;
import com.github.dynamic.threadpool.config.toolkit.SimpleReadWriteLock;
import com.github.dynamic.threadpool.config.toolkit.SingletonRepository;
import com.github.dynamic.threadpool.common.constant.Constants;
import lombok.Getter;
import lombok.Setter;

/**
 * Cache item.
 *
 * @author chen.ma
 * @date 2021/6/24 21:23
 */
@Getter
@Setter
public class CacheItem {

    final String groupKey;

    public volatile String md5 = Constants.NULL;

    public volatile long lastModifiedTs;

    public volatile ConfigAllInfo configAllInfo;

    public SimpleReadWriteLock rwLock = new SimpleReadWriteLock();

    public CacheItem(String groupKey) {
        this.groupKey = SingletonRepository.DataIdGroupIdCache.getSingleton(groupKey);
    }

    public CacheItem(String groupKey, String md5) {
        this.md5 = md5;
        this.groupKey = SingletonRepository.DataIdGroupIdCache.getSingleton(groupKey);
    }

    public CacheItem(String groupKey, ConfigAllInfo configAllInfo) {
        this.configAllInfo = configAllInfo;
        this.md5 = Md5Util.getTpContentMd5(configAllInfo);
        this.groupKey = SingletonRepository.DataIdGroupIdCache.getSingleton(groupKey);
    }

}
