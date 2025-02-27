/*
 * Copyright 2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

package net.mamoe.mirai.internal.contact.info

import kotlinx.serialization.Serializable
import net.mamoe.mirai.data.FriendInfo

// since 2.4, for serialization
@Serializable
internal data class FriendInfoImpl(
    override val uin: Long,
    override var nick: String,
    override var remark: String,
) : FriendInfo {
    companion object {
        fun FriendInfo.impl() = if (this is FriendInfoImpl) this else FriendInfoImpl(uin, nick, remark)
    }
}