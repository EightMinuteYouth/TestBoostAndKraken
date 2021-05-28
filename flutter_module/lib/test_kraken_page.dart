import 'package:flutter/material.dart';
import 'package:kraken/kraken.dart';

class TestKrakenPage extends StatefulWidget {
  @override
  _TestKrakenPageState createState() => _TestKrakenPageState();
}

class _TestKrakenPageState extends State<TestKrakenPage> {

  Kraken kraken;

  @override
  void initState() {
    super.initState();
    kraken = Kraken(bundleURL: 'http://192.168.3.177:3333/kraken/home.js');
  }
  @override
  Widget build(BuildContext context) {

    return Scaffold(
      body: kraken,
    );
  }
}
