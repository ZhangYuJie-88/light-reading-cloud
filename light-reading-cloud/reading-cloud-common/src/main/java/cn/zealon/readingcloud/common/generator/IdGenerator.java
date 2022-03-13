package cn.zealon.readingcloud.common.generator;

import cn.hutool.core.lang.UUID;
import cn.hutool.core.lang.generator.UUIDGenerator;
import com.yomahub.tlog.id.TLogIdGenerator;

/**
 * <h3>light-reading-cloud</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-13 17:05
 **/

public class IdGenerator extends TLogIdGenerator {
    @Override
    public String generateTraceId() {
        return String.valueOf(UUID.fastUUID().toString());
    }
}
