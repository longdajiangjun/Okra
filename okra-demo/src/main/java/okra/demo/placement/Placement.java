/*
 *     Copyright 2016-2026 TinyZ
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package okra.demo.placement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Placement.
 * <zh-cn>
 * 放置类服务器.
 * </zh-cn>
 *
 * @author TinyZ
 * @date 2017-01-22.
 */
@Service()
public final class Placement {

    @Autowired
    PlacementServer server;

    @PostConstruct
    public void initialize() {
        //  初始化服务
        server.initialize();
        //  启动服务器
        server.start();
    }


}
