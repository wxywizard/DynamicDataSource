package com.sailing.transmission.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author: wangxy
 */
@Data
@Accessors(chain = true)
@TableName("t4_vio_violation")
public class VioViolation implements Serializable {

    private static final long serialVersionUID = 9058680979841002920L;

    /**
     * 违法时间
     */
    private String wfsj;

    /**
     * 违法地点
     */
    private String wfdd;

    /**
     * 违法编号
     */
    private String wfbh;

    /**
     * 号牌号码
     */
    private String hphm;

    /**
     * 决定书类别
     */
    private String jdslb;

    /**
     * 决定书编号
     */
    private String jdsbh;

    /**
     * 文书校验位
     */
    private String wsjyw;

    /**
     * 人员分类
     */
    private String ryfl;

    /**
     * 驾驶证号
     */
    private String jszh;

    /**
     * 档案编号
     */
    private String dabh;

    /**
     * 发证机关
     */
    private String fzjg;

    /**
     * 准驾车型
     */
    private String zjcx;

    /**
     * 当事人
     */
    private String dsr;

    /**
     * 住所行政区划
     */
    private String zsxzqh;

    /**
     * 住所详细地址
     */
    private String zsxxdz;

    /**
     * 电话
     */
    private String dh;

    /**
     * 联系方式
     */
    private String lxfs;

    /**
     * 车辆分类
     */
    private String clfl;

    /**
     * 号牌种类
     */
    private String hpzl;

    /**
     * 机动车所有人
     */
    private String jdcsyr;

    /**
     * 机动车使用性质
     */
    private String syxz;

    /**
     * 交通方式
     */
    private String jtfs;

    /**
     * 行政区划
     */
    private String xzqh;

    /**
     * 道路类型 DMLB= 3124
     */
    private String dllx;

    /**
     * 公路行政等级 DMLB3116
     */
    private String glxzdj;

    /**
     * 路口路段代码 当为城市道路时存放路口号，为高速、省道等时存放公里数
     */
    private String lddm;

    /**
     * 地点米数
     */
    private String ddms;

    /**
     * 地点绝对位置
     */
    private String ddjdwz;

    /**
     * 违法地址
     */
    private String wfdz;

    /**
     * 违法行为
     */
    private String wfxw;

    /**
     * 违法记分数
     */
    private String wfjfs;

    /**
     * 罚款金额
     */
    private String fkje;

    /**
     * 实测值
     */
    private String scz;

    /**
     * 标准值
     */
    private String bzz;

    /**
     * 滞纳金
     */
    private String znj;

    /**
     * 执勤民警
     */
    private String zqmj;

    /**
     * 交款方式
     */
    private String jkfs;

    /**
     * 发现机关
     */
    private String fxjg;

    /**
     * 发现机关名称
     */
    private String fxjgmc;

    /**
     * 处理机关
     */
    private String cljg;

    /**
     * 处理机关名称
     */
    private String cljgmc;

    /**
     * 处罚种类
     */
    private String cfzl;

    /**
     * 处理时间
     */
    private String clsj;

    /**
     * 交款标记
     */
    private String jkbj;

    /**
     * 交款日期
     */
    private String jkrq;

    /**
     * 强制措施凭证号
     */
    private String pzbh;

    /**
     * 拒收拒签标记
     */
    private String jsjqbj;

    /**
     * 记录类型
     */
    private String jllx;

    /**
     * 录入人
     */
    private String lrr;

    /**
     * 录入时间
     */
    private String lrsj;

    /**
     * 经办人1
     */
    private String jbr1;

    /**
     * 经办人2
     */
    private String jbr2;

    /**
     * 事故等级 code61
     */
    private String sgdj;

    /**
     * 处理对象标记 0-本地;1-本省外地市;2-外省
     */
    private String cldxbj;

    /**
     * 机动车处理对象标记
     */
    private String jdccldxbj;

    /**
     * 转递记录标记 0-本地;1-异地转入
     */
    private String zdjlbj;

    /**
     * 信息来源 1-现场处罚，2-非现场处罚
     */
    private String xxly;

    /**
     * 写入模式 1-系统写入;2-接口写入;3-内部其他系统写入
     */
    private String xrms;

    /**
     * 导库标记
     */
    private String dkbj;

    /**
     * 减免滞纳金标记 code64
     */
    private String jmznjbj;

    /**
     * 转递标记
     */
    private String zdbj;

    /**
     * 接受机关
     */
    private String jsjg;

    /**
     * 发送机关
     */
    private String fsjg;

    /**
     * 更新时间
     */
    private String gxsj;

    /**
     * 备注
     */
    private String bz;

    /**
     * 证件名称
     */
    private String zjmc;

    /**
     * 初次领证日期
     */
    private String cclzrq;

    /**
     * 年龄
     */
    private String nl;

    /**
     * 性别 code50
     */
    private String xb;

    /**
     * 0-否;1-是;2-未核查
     */
    private String hcbj;

    /**
     * 精度
     */
    private String jd;

    /**
     * 维度
     */
    private String wd;

    /**
     * 预留字段
     */
    private String ylzz1;

    /**
     * 预留字段
     */
    private String ylzz2;

    /**
     * 预留字段
     */
    private String ylzz3;

    /**
     * 预留字段
     */
    private String ylzz4;

    /**
     * 预留字段
     */
    private String ylzz5;

    /**
     * 存放支队工作库接受时间
     */
    private String ylzz6;

    /**
     * 预留字段
     */
    private String ylzz7;

    /**
     * 预留字段
     */
    private String ylzz8;

    /**
     *
     */
    private String deipTime;

    /**
     *
     */
    private String deipUpdateTime;

    /**
     *
     */
    private String cjfs;

    /**
     *
     */
    private String wfsj1;

    /**
     *
     */
    private String wfdd1;

    /**
     *
     */
    private String lddm1;

    /**
     *
     */
    private String ddms1;

    /**
     * 驾驶人性质
     */
    private String jsrxz;

    /**
     * 车辆用途
     */
    private String clyt;

    /**
     * 是否提供校车服务
     */
    private String xcfw;

    /**
     * 电子坐标
     */
    private String dzzb;

    /**
     * DWD新增时间
     */
    private String dwdLoadtime;

    /**
     * DWD更新时间
     */
    private String dwdUpdatetime;

    /**
     * 有效标志
     */
    private String dwdYxbz;

    /**
     * 日期分区
     */
    private String dt;

    /**
     * 校验位
     */
    private String ywjyw;

    /**
     *
     */
    private String hpys;
}
