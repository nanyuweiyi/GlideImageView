package com.demo.glideimageview.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunfusheng on 2017/6/27.
 */
public class ModelUtil {

    public static List<ImageModel> getImages() {
        List<ImageModel> list = new ArrayList<>();

        ArrayList<String> images = new ArrayList<>();
        images.add("http://pic.58pic.com/58pic/13/62/02/07d58PICcxz_1024.jpg");
        list.add(new ImageModel("画卷：天道酬勤", images));

        images = new ArrayList<>();
        images.add("http://img.pconline.com.cn/images/photo2/591572/1100105945280.jpg");
        images.add("http://www.pop-photo.com.cn/data/attachment/forum/myspace/image/2011/07/0/46/76/467693_233590968.jpg");
        images.add("http://www.52design.com/pic/20121/201211313245374.jpg");
        list.add(new ImageModel("微距离摄影", images));

        images = new ArrayList<>();
        images.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498629002766&di=6fac924b9c9bc0858074a5eb455e4bd8&imgtype=0&src=http%3A%2F%2Fimg1.3lian.com%2F2015%2Fw21%2F8%2Fd%2F85.jpg");
        list.add(new ImageModel("又一个小猫咪(450X798)", images));

        images = new ArrayList<>();
        images.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498628972675&di=329747bae23548dfd988fbc6dcaf76b7&imgtype=0&src=http%3A%2F%2Fwww.17sucai.com%2Fupload%2F534358%2F2016-06-13%2Facdf7f6e040aee07147f9e3508833c8a_big.jpg");
        list.add(new ImageModel("一个小猫咪(650X406)", images));

        images = new ArrayList<>();
        images.add("http://img15.3lian.com/2015/h1/308/d/199.jpg");
        images.add("http://pic1.win4000.com/wallpaper/f/566a714a786cc.jpg");
        images.add("http://img15.3lian.com/2015/h1/308/d/204.jpg");
        images.add("http://imglf1.ph.126.net/DIe00tFQ1SZOdKUDG8AO1g==/2068278128970036688.jpg");
        list.add(new ImageModel("世界著名建筑", images));

        images = new ArrayList<>();
        images.add("http://wx4.sinaimg.cn/mw690/e59bcb0dly1fgqlue0vtvj20c83htx3d.jpg");
        list.add(new ImageModel("开发者头条的截图(440X4529)", images));

        images = new ArrayList<>();
        images.add("http://img2.imgtn.bdimg.com/it/u=2850936076,2080165544&fm=206&gp=0.jpg");
        images.add("http://img3.imgtn.bdimg.com/it/u=524208507,12616758&fm=206&gp=0.jpg");
        images.add("http://img3.imgtn.bdimg.com/it/u=698582197,4250615262&fm=206&gp=0.jpg");
        images.add("http://img5.imgtn.bdimg.com/it/u=1467751238,3257336851&fm=11&gp=0.jpg");
        images.add("http://img5.imgtn.bdimg.com/it/u=3191365283,111438732&fm=21&gp=0.jpg");
        images.add("http://img5.imgtn.bdimg.com/it/u=482494496,1350922497&fm=206&gp=0.jpg");
        images.add("http://img4.imgtn.bdimg.com/it/u=2440866214,1867472386&fm=21&gp=0.jpg");
        images.add("http://img3.imgtn.bdimg.com/it/u=3040385967,1031044866&fm=21&gp=0.jpg");
        images.add("http://img1.imgtn.bdimg.com/it/u=1832737924,144748431&fm=21&gp=0.jpg");
        images.add("http://img5.imgtn.bdimg.com/it/u=2091366266,1524114981&fm=21&gp=0.jpg");
        images.add("http://img5.imgtn.bdimg.com/it/u=2091366266,1524114981&fm=21&gp=0.jpg");
        images.add("http://img5.imgtn.bdimg.com/it/u=1424970962,1243597989&fm=21&gp=0.jpg");
        list.add(new ImageModel("一共12张图片", images));

        return list;
    }

    public static List<NewsModel> getNewsList() {
        List<NewsModel> list = new ArrayList<>();

        list.add(new NewsModel("为迎接伊万卡等宾客访问 印度一座城市将驱逐乞丐",
                "http://cms-bucket.nosdn.127.net/c80973c27a4541cda761f6a49045854720171110113147.png?imageView&thumbnail=140y88&quality=85"));

        list.add(new NewsModel("英国“脱欧”终于有眉目!政府将敲定具体离开时间",
                "http://cms-bucket.nosdn.127.net/f5e164f5805e4a4480b30d34826c70b920171110090734.png?imageView&thumbnail=140y88&quality=85"));

        list.add(new NewsModel("沙特:因无足够证据 先释放部分因涉贪腐被捕人员",
                "http://cms-bucket.nosdn.127.net/49d4eb3d6969440590cfb326b513d97b20171109234915.png?imageView&thumbnail=140y88&quality=85"));

        list.add(new NewsModel("关系骤然紧张!伊朗总统喊话沙特 ＂宿敌＂死结何解?",
                "http://cms-bucket.nosdn.127.net/629515b9eb9946cfa65d33401bb1016120171109153300.png?imageView&thumbnail=140y88&quality=85"));

        list.add(new NewsModel("为迎接伊万卡等宾客访问 印度一座城市将驱逐乞丐",
                "http://cms-bucket.nosdn.127.net/c80973c27a4541cda761f6a49045854720171110113147.png?imageView&thumbnail=140y88&quality=85"));

        list.add(new NewsModel("英国“脱欧”终于有眉目!政府将敲定具体离开时间",
                "http://cms-bucket.nosdn.127.net/f5e164f5805e4a4480b30d34826c70b920171110090734.png?imageView&thumbnail=140y88&quality=85"));

        list.add(new NewsModel("沙特:因无足够证据 先释放部分因涉贪腐被捕人员",
                "http://cms-bucket.nosdn.127.net/49d4eb3d6969440590cfb326b513d97b20171109234915.png?imageView&thumbnail=140y88&quality=85"));

        list.add(new NewsModel("关系骤然紧张!伊朗总统喊话沙特 ＂宿敌＂死结何解?",
                "http://cms-bucket.nosdn.127.net/629515b9eb9946cfa65d33401bb1016120171109153300.png?imageView&thumbnail=140y88&quality=85"));

        list.add(new NewsModel("为迎接伊万卡等宾客访问 印度一座城市将驱逐乞丐",
                "http://cms-bucket.nosdn.127.net/c80973c27a4541cda761f6a49045854720171110113147.png?imageView&thumbnail=140y88&quality=85"));

        list.add(new NewsModel("英国“脱欧”终于有眉目!政府将敲定具体离开时间",
                "http://cms-bucket.nosdn.127.net/f5e164f5805e4a4480b30d34826c70b920171110090734.png?imageView&thumbnail=140y88&quality=85"));

        list.add(new NewsModel("沙特:因无足够证据 先释放部分因涉贪腐被捕人员",
                "http://cms-bucket.nosdn.127.net/49d4eb3d6969440590cfb326b513d97b20171109234915.png?imageView&thumbnail=140y88&quality=85"));

        list.add(new NewsModel("关系骤然紧张!伊朗总统喊话沙特 ＂宿敌＂死结何解?",
                "http://cms-bucket.nosdn.127.net/629515b9eb9946cfa65d33401bb1016120171109153300.png?imageView&thumbnail=140y88&quality=85"));

        return list;
    }

}
