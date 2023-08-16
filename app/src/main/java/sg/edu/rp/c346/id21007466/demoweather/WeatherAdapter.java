package sg.edu.rp.c346.id21007466.demoweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WeatherAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Weather> weatherList;

    public WeatherAdapter(Context context, ArrayList<Weather> weatherList) {
        this.context = context;
        this.weatherList = weatherList;
    }

    @Override
    public int getCount() {
        return weatherList.size();
    }

    @Override
    public Object getItem(int position) {
        return weatherList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.list_item_weather, parent, false);
        }

        Weather weather = weatherList.get(position);

        TextView tvArea = convertView.findViewById(R.id.tvArea); // Replace with your TextView's ID
        TextView tvForecast = convertView.findViewById(R.id.tvForecast); // Replace with your TextView's ID

        tvArea.setText(weather.getArea());
        tvForecast.setText(weather.getForecast());

        return convertView;
    }
}