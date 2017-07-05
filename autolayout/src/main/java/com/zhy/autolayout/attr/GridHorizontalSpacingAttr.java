package com.zhy.autolayout.attr;

import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by zhy on 15/12/5.
 */
public class GridHorizontalSpacingAttr extends AutoAttr
{
    public GridHorizontalSpacingAttr(int pxVal, int baseWidth, int baseHeight)
    {
        super(pxVal, baseWidth, baseHeight);
    }

    @Override
    protected int attrVal()
    {
        return Attrs.GRID_HORIZONTAL_SPACING;
    }

    @Override
    protected boolean defaultBaseWidth()
    {
        return true;
    }

    @Override
    protected void execute(View view, int val)
    {
        if(!(view instanceof GridView))
        {
            return ;
        }
        GridView gridView = (GridView) view;
        gridView.setHorizontalSpacing(val);
    }

    public static GridHorizontalSpacingAttr generate(int val, int baseFlag)
    {
        GridHorizontalSpacingAttr attr = null;
        switch (baseFlag)
        {
            case AutoAttr.BASE_WIDTH:
                attr = new GridHorizontalSpacingAttr(val, Attrs.GRID_HORIZONTAL_SPACING, 0);
                break;
            case AutoAttr.BASE_HEIGHT:
                attr = new GridHorizontalSpacingAttr(val, 0, Attrs.GRID_HORIZONTAL_SPACING);
                break;
            case AutoAttr.BASE_DEFAULT:
                attr = new GridHorizontalSpacingAttr(val, 0, 0);
                break;
        }
        return attr;
    }
}
