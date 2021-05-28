import 'package:flutter/material.dart';
import 'package:flutter_boost/flutter_boost.dart';
import 'package:flutter_module/test_kraken_page.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  void initState() {
    super.initState();

    FlutterBoost.singleton.registerPageBuilders(
      {
        'testKraken': (pageName, params, _) {
          print('flutterPage params:$params');
          print('================> id = ${params["id"]}');
          print('================> name = ${params["name"]}');
          return TestKrakenPage();
        },
      },
    );
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(builder: FlutterBoost.init(), home: Container());
  }
}
