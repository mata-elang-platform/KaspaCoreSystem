package me.mamotis.kaspacore.util

import java.util.UUID

object Statements {
  def push_raw_data_by_company(id: UUID, company:String, device_id: String, year: Integer, month: Integer, day: Integer,
                               hour: Integer, minute: Integer, second: Integer, protocol: String, ip_type: String, src_mac: String,
                               dest_mac: String, src_ip: String, dest_ip: String, src_port: Integer, dest_port: Integer,
                               alert_msg: String, classification: Integer, priority: Integer, sig_id: Integer,
                               sig_gen: Integer, sig_rev: Integer, src_country: String, src_region: String, dest_country: String,
                               dest_region: String ): String =
    s"""
       |INSERT INTO kaspa.raw_data_by_company ("id", "company", "device_id", "year", "month", "day", "hour", "minute", "second",
       |"protocol", "ip_type", "src_mac", "dest_mac", "src_ip", "dest_ip", "src_port", "dest_port",
       |"alert_msg", "classification", "priority", "sig_id", "sig_gen", "sig_rev", "src_country", "src_region", "dest_country", "dest_region")
       |values($id, '$company', '$device_id', $year, $month, $day, $hour, $minute, $second, '$protocol',
       |'$ip_type', '$src_mac', '$dest_mac', '$src_ip', '$dest_ip',$src_port, $dest_port, '$alert_msg',
       |$classification, $priority, $sig_id, $sig_gen, $sig_rev, '$src_country', '$src_region', '$dest_country', '$dest_region')""".stripMargin

  def push_raw_data_by_device_id(id: UUID, company:String, device_id: String, year: Integer, month: Integer, day: Integer,
                                 hour: Integer, minute: Integer, second: Integer, protocol: String, ip_type: String, src_mac: String,
                                 dest_mac: String, src_ip: String, dest_ip: String, src_port: Integer, dest_port: Integer,
                                 alert_msg: String, classification: Integer, priority: Integer, sig_id: Integer,
                                 sig_gen: Integer, sig_rev: Integer, src_country: String, src_region: String, dest_country: String,
                                 dest_region: String): String =
    s"""
       |INSERT INTO kaspa.raw_data_by_device_id ("id", "company", "device_id", "year", "month", "day", "hour", "minute", "second",
       |"protocol", "ip_type", "src_mac", "dest_mac", "src_ip", "dest_ip", "src_port", "dest_port",
       |"alert_msg", "classification", "priority", "sig_id", "sig_gen", "sig_rev", "src_country", "src_region", "dest_country", "dest_region")
       |values($id, '$company', '$device_id', $year, $month, $day, $hour, $minute, $second, '$protocol',
       |'$ip_type', '$src_mac', '$dest_mac', '$src_ip', '$dest_ip',$src_port, $dest_port, '$alert_msg',
       |$classification, $priority, $sig_id, $sig_gen, $sig_rev, '$src_country', '$src_region', '$dest_country', '$dest_region')""".stripMargin
}
