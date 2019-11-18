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
@TableName("t4_vehicle")
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 2120412597171762982L;
    /**
         * 身份证明号码
         */
        private String sfzmhm;

        /**
         * 机动车序号
         */
        private String xh;

        /**
         * 号牌号码
         */
        private String hphm;

        /**
         * 号牌种类
         */
        private String hpzl;

        /**
         * 中文品牌
         */
        private String clpp1;

        /**
         * 车辆型号
         */
        private String clxh;

        /**
         * 英文品牌
         */
        private String clpp2;

        /**
         * 国产/进口
         */
        private String gcjk;

        /**
         * 制造国
         */
        private String zzg;

        /**
         * 制造厂名称
         */
        private String zzcmc;

        /**
         * 车辆识别代号
         */
        private String clsbdh;

        /**
         * 发动机号
         */
        private String fdjh;

        /**
         * 车辆类型
         */
        private String cllx;

        /**
         * 车身颜色
         */
        private String csys;

        /**
         * 使用性质
         */
        private String syxz;

        /**
         * 身份证明名称
         */
        private String sfzmmc;

        /**
         * 机动车所有人
         */
        private String syr;

        /**
         * 所有权
         */
        private String syq;

        /**
         * 初次登记日期
         */
        private String ccdjrq;

        /**
         * 初次登记日期(日期格式)
         */
        private String ccdjrqDt;

        /**
         * 最近定检日期
         */
        private String djrq;

        /**
         * 最近定检日期(日期格式)
         */
        private String djrqDt;

        /**
         * 检验有效期止
         */
        private String yxqz;

        /**
         * 检验有效期止(日期格式)
         */
        private String yxqzDt;

        /**
         * 强制报废期止
         */
        private String qzbfqz;

        /**
         * 强制报废期止(日期格式)
         */
        private String qzbfqzDt;

        /**
         * 发证机关
         */
        private String fzjg;

        /**
         * 管理部门
         */
        private String glbm;

        /**
         * 发牌日期
         */
        private String fprq;

        /**
         * 发牌日期(日期格式)
         */
        private String fprqDt;

        /**
         * 发行驶证日期
         */
        private String fzrq;

        /**
         * 发行驶证日期(日期格式)
         */
        private String fzrqDt;

        /**
         * 发登记证书日期
         */
        private String fdjrq;

        /**
         * 发登记证书日期(日期格式)
         */
        private String fdjrqDt;

        /**
         * 发合格证日期
         */
        private String fhgzrq;

        /**
         * 发合格证日期(日期格式)
         */
        private String fhgzrqDt;

        /**
         * 保险终止日期
         */
        private String bxzzrq;

        /**
         * 保险终止日期(日期格式)
         */
        private String bxzzrqDt;

        /**
         * 补领号牌次数
         */
        private String bpcs;

        /**
         * 补领行驶证次数
         */
        private String bzcs;

        /**
         * 补/换领证书次数
         */
        private String bdjcs;

        /**
         * 登记证书编号
         */
        private String djzsbh;

        /**
         * 制登记证书行数
         */
        private String zdjzshs;

        /**
         * 档案编号
         */
        private String dabh;

        /**
         * 管理辖区
         */
        private String xzqh;

        /**
         * 机动车状态
         */
        private String zt;

        /**
         * 0-未抵押，1-已抵押
         */
        private String dybj;

        /**
         * 经办人
         */
        private String jbr;

        /**
         * 1注册2转入3过户
         */
        private String clly;

        /**
         * 注册流水号
         */
        private String lsh;

        /**
         * 发动机型号
         */
        private String fdjxh;

        /**
         * 燃料种类
         */
        private String rlzl;

        /**
         * 排量
         */
        private String pl;

        /**
         * 功率
         */
        private String gl;

        /**
         * 转向形式
         */
        private String zxxs;

        /**
         * 车外廓长
         */
        private String cwkc;

        /**
         * 车外廓宽
         */
        private String cwkk;

        /**
         * 车外廓高
         */
        private String cwkg;

        /**
         * 货箱内部长度
         */
        private String hxnbcd;

        /**
         * 货箱内部宽度
         */
        private String hxnbkd;

        /**
         * 货箱内部高度
         */
        private String hxnbgd;

        /**
         * 钢板弹簧片数
         */
        private String gbthps;

        /**
         * 轴数
         */
        private String zs;

        /**
         * 轴距
         */
        private String zj;

        /**
         * 前轮距
         */
        private String qlj;

        /**
         * 后轮距
         */
        private String hlj;

        /**
         * 轮胎规格
         */
        private String ltgg;

        /**
         * 轮胎数
         */
        private String lts;

        /**
         * 总质量
         */
        private String zzl;

        /**
         * 整备质量
         */
        private String zbzl;

        /**
         * 核定载质量
         */
        private String hdzzl;

        /**
         * 核定载客
         */
        private String hdzk;

        /**
         * 准牵引总质量
         */
        private String zqyzl;

        /**
         * 驾驶室前排载客人数
         */
        private String qpzk;

        /**
         * 驾驶室后排载客人数
         */
        private String hpzk;

        /**
         * 环保达标情况
         */
        private String hbdbqk;

        /**
         * 出厂日期
         */
        private String ccrq;

        /**
         * 出厂日期(日期格式)
         */
        private String ccrqDt;

        /**
         * 获得方式
         */
        private String hdfs;

        /**
         * 来历凭证1
         */
        private String llpz1;

        /**
         * 凭证编号1
         */
        private String pzbh1;

        /**
         * 来历凭证2
         */
        private String llpz2;

        /**
         * 凭证编号2
         */
        private String pzbh2;

        /**
         * 销售单位
         */
        private String xsdw;

        /**
         * 销售价格
         */
        private String xsjg;

        /**
         * 销售日期
         */
        private String xsrq;

        /**
         * 销售日期(日期格式)
         */
        private String xsrqDt;

        /**
         * 进口凭证
         */
        private String jkpz;

        /**
         * 进口凭证编号
         */
        private String jkpzhm;

        /**
         * 合格证编号
         */
        private String hgzbh;

        /**
         * 纳税证明
         */
        private String nszm;

        /**
         * 纳税证明编号
         */
        private String nszmbh;

        /**
         * 更新日期
         */
        private String gxrq;

        /**
         * 更新日期(日期格式)
         */
        private String gxrqDt;

        /**
         * 相关资料
         */
        private String xgzl;

        /**
         * 前膜编号
         */
        private String qmbh;

        /**
         * 后膜编号
         */
        private String hmbh;

        /**
         * 备注
         */
        private String bz;

        /**
         * 住所行政区划
         */
        private String zsxzqh;

        /**
         * 住所详细地址
         */
        private String zsxxdz;

        /**
         * 住所邮政编码
         */
        private String yzbm1;

        /**
         * 联系电话
         */
        private String lxdh;

        /**
         * 暂住行政区划
         */
        private String zzxzqh;

        /**
         * 暂住详细地址
         */
        private String zzxxdz;

        /**
         * 暂住邮政编码
         */
        private String yzbm2;

        /**
         * 自定义状态
         */
        private String zdyzt;

        /**
         * 原机动车序号
         */
        private String yxh;

        /**
         * 查验人员
         */
        private String cyry;

        /**
         * 底盘合格证编号
         */
        private String dphgzbh;

        /**
         * 社区代码
         */
        private String sqdm;

        /**
         * 车辆用途
         */
        private String clyt;

        /**
         * 用途属性
         */
        private String ytsx;

        /**
         * 电子邮箱
         */
        private String dzyx;

        /**
         * 行驶证证芯编号
         */
        private String xszbh;

        /**
         * 手机号码
         */
        private String sjhm;

        /**
         * 检验合格标志
         */
        private String jyhgbzbh;

        /**
         * 单位编号
         */
        private String dwbh;

        /**
         * 使用起始日期
         */
        private String syqsrq;

        /**
         * 使用起始日期(日期格式)
         */
        private String syqsrqDt;

        /**
         * 逾期检验强制报废期止
         */
        private String yqjyqzbfqz;

        /**
         * 逾期2个检验周期期止
         */
        private String yqjyqz2;

        /**
         * 发动机缸数
         */
        private String fdjgs;

        /**
         * 专项作业车是否有载货功能 1-是；2-否
         */
        private String sfyzhgn;

        /**
         * 组织机构类型 CODE=0021
         */
        private String zzjglx;

        /**
         * 是否为微型面包车 1-是；2-否
         */
        private String wxmbc;

        /**
         * 是否为农村地区使用 1-是；2-否
         */
        private String ncdqsy;

        /**
         * 号牌启用时间
         */
        private String hpqysj;

        /**
         *
         */
        private String deipUpdateTime;

        /**
         * (日期格式)
         */
        private String deipUpdateTimeDt;

        /**
         *
         */
        private String deipTime;

        /**
         * -(日期格式)
         */
        private String deipTimeDt;

        /**
         * 电子标识序列号
         */
        private String dzbsxlh;

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
         * 车辆类型名称
         */
        private String cllxmc;

        /**
         * 校验位
         */
        private String jyw;

        /**
         * 暂住居住证明
         */
        private String zzz;

        /**
         * 号牌颜色
         */
        private String hpys;
}
